'use strict'

const mongoose = require('mongoose');
const RoomSchema = new mongoose.Schema({
    address: String,
    city: String,
    district: String,
    ward: String,
    price: Number,
    area: Number,
    description: String
}, {
    collection: 'rooms',
    max: 1000
})

module.exports = mongoose.model('Room', RoomSchema);