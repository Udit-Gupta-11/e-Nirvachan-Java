import httpCient from '../http-commonJava';

export const logIn=(vid, pass)=>{
  return httpCient.post('/login', [vid, pass]);
}

export const signUp = (voter) => {
  return httpCient.post('/register', [voter.first_name, voter.last_name, voter.password, voter.gender, voter.dob,
  voter.address, voter.city, voter.state, voter.mobileno, voter.email, voter.aadhar_number, voter.caste]);
}

export const getStatus = (vid) => {
  return httpCient.get('/status/'+ vid);
}