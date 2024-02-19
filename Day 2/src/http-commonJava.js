import axios from 'axios';

export const BASE_URL = 'http://localhost:8081/voters/';
export default axios.create({
    baseURL: BASE_URL,
    headers: {
        'Content-Type': 'application/json',
      }
});