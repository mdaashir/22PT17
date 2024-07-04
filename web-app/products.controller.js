const Product = require('../models/product.model');

exports.findAll = (req, res) => {
	Product.findAll()
		.then((data) => {
			res.send(data);
		})
		.catch((err) => {
			res.status(500).send({
				message:
					err.message || 'Some error occurred while retrieving products.',
			});
		});
};
