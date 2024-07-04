const express = require('express');
const router = express.Router();
const products = require('../controllers/products.controller');

router.get('/', products.findAll);

module.exports = router;
