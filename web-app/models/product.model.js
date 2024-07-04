const { Model, DataTypes } = require('sequelize');
const sequelize = require('../sequelize');

class Product extends Model {}

Product.init(
	{
		id: {
			type: DataTypes.INTEGER,
			primaryKey: true,
			autoIncrement: true,
		},
		name: {
			type: DataTypes.STRING,
			allowNull: false,
		},
		description: {
			type: DataTypes.TEXT,
			allowNull: true,
		},
		price: {
			type: DataTypes.FLOAT,
			allowNull: false,
		},
		imageUrl: {
			type: DataTypes.STRING,
			allowNull: true,
		},
	},
	{
		sequelize,
		modelName: 'Product',
	}
);

module.exports = Product;
