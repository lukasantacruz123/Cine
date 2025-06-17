import express from 'express';
import cors from 'cors';
import vexor from 'vexor';
import dotenv from 'dotenv';

dotenv.config();
const { Vexor } = vexor;

const vexorInstance = new Vexor({
	publishableKey: 'vx_prod_pk_81f1bc1b0f1e091e2872870b4faaa6c8_cea1d37a_dc8e_49c7_8e37_36c97918c265_63b6e4',
	projectId: '684ca48c69c672e3fcedeafb',
	apiKey: 'vx_prod_sk_604e4bc7347222cef380666c509e86f6_79f9ef20_c02f_4a1b_aed7_43822d061df1_8eefdb',
});

const app = express();
const PORT = 3000; // <-- CAMBIADO

app.use(cors({
	origin: 'http://localhost:8080', // <- Asegurate de usar el puerto del cliente (tu JSP/Tomcat)
	methods: ['GET', 'POST'],
	allowedHeaders: ['Content-Type']
}));

app.use(express.json());

app.post('/create_payment', async (req, res) => {
	const { entradas: product } = req.body;

	if (!product || !product.title || !product.unit_price || !product.quantity) {
		return res.status(400).json({ error: 'La entrada debe tener un título, precio y cantidad' });
	}

	try {
		const paymentResponse = await vexorInstance.pay.mercadopago({
			items: [
				{
					title: product.title,
					unit_price: product.unit_price,
					quantity: product.quantity,
				},
			],
		});

		res.status(200).json({ payment_url: paymentResponse.payment_url });
	} catch (error) {
		console.error('Error al crear el pago:', error);
		res.status(500).json({ error: 'Error al procesar el pago' });
	}
});

app.listen(PORT, () => {
	console.log(`Servidor de pagos activo en http://localhost:${PORT}`);
});
