import axios from "axios"

const BASE_URL = "http://localhost:8085/JavaSpringApp/api/"


export const endpoints = {
    'category': '/category',
    'products': '/products'
}

export default axios.create({
    baseURL: BASE_URL
});