// product.model.ts
import { Model, DataTypes } from 'sequelize';
import sequelize from './sequelize';

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

export default Product;
