import { Link, NavLink } from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';
import "./css/Login.css"
import ReCAPTCHA from "react-google-recaptcha"
import React, { useState } from 'react';
import { logIn } from "../Services/VoterServiceJava";

const Login = () => {
    const [hide, setHide] = useState(true);
    const [userId, setUserId] = useState('');
    const [vpass, setVpass] = useState('');
    const [allow, setAllow] = useState(false);
    const handleChange = (event) => {
        setUserId(event.target.value);
    }
    const passChange = (event) => {
        setVpass(event.target.value);
    }
    const confirmVoter=()=>{
        logIn(userId, vpass)
        .then((responce)=>{console.log('Welcome '+responce.data); setAllow(responce)})
        .catch((err)=>console.log(err));
    }

    return (
        <div className="main">
            <div className='title'>

            </div>
            {
                hide &&
                <div className="login" id="voter">
                    <form className="in">
                        <h4 className='mb-3'>Voter Login</h4>
                        <div className="input-group">
                            <div className="input-group-prepend">
                                <span class="input-group-text">Voter Id</span>
                            </div>
                            <input type="text" aria-label="First name" name="userId" value={userId} onChange={handleChange} className="form-control" />
                        </div>
                        <br />

                        <div className="input-group">
                            <div className="input-group-prepend">
                                <span class="input-group-text">Password</span>
                            </div>
                            <input type="text" aria-label="First name" name="vpass" value={vpass} onChange={passChange} className="form-control" />
                        </div>
                        <br />
                        <ReCAPTCHA sitekey="6LfHwmUpAAAAAEI7G0ERpYeqzhHSKVPm81hTvp11" id="captcha" />

                        <Link to={allow ? "voterportal" : '/'} state={{ userId }}>
                            <button onClick={confirmVoter}>Log In</button>
                        </Link>

                        <NavLink to={''} className="link1">Forgot Password?</NavLink>
                        <NavLink to={'register'} className='link2'>Sign Up</NavLink>
                    </form>
                </div>
            }

            {
                !hide && <div>
                    <div className="login" id="party">
                        <form className="in">
                            <h4 className='mb-3'>Political Party Login</h4>
                            <div className="input-group">
                                <div className="input-group-prepend">
                                    <span class="input-group-text">Party Id</span>
                                </div>
                                <input type="text" aria-label="First name" className="form-control" />
                            </div>
                            <br />

                            <div className="input-group">
                                <div className="input-group-prepend">
                                    <span class="input-group-text">Password</span>
                                </div>
                                <input type="text" aria-label="First name" className="form-control" />
                            </div>
                            <br />
                            <ReCAPTCHA sitekey="6LfHwmUpAAAAAEI7G0ERpYeqzhHSKVPm81hTvp11" id="captcha" />

                            <Link to="politicalpartyportal">
                                <button>Log In</button>
                            </Link>

                            <NavLink to={''} className="link1">Forgot Password?</NavLink>
                            <NavLink to={''} className='link2'>Sign Up</NavLink>
                        </form>
                    </div>

                    <div className="login" id="executive">
                        <form className="in">
                            <h4 className='mb-3'>Election Executive Login</h4>
                            <div className="input-group">
                                <div className="input-group-prepend">
                                    <span class="input-group-text">Executive Id</span>
                                </div>
                                <input type="text" aria-label="First name" className="form-control" />
                            </div>
                            <br />

                            <div className="input-group">
                                <div className="input-group-prepend">
                                    <span class="input-group-text">Password</span>
                                </div>
                                <input type="text" aria-label="First name" className="form-control" />
                            </div>
                            <br />
                            <ReCAPTCHA sitekey="6LfHwmUpAAAAAEI7G0ERpYeqzhHSKVPm81hTvp11" id="captcha" />

                            <Link to="electionexecutiveportal">
                                <button>Log In</button>
                            </Link>

                            <NavLink to={''} className="link1">Forgot Password?</NavLink>
                            <NavLink to={''} className='link2'>Sign Up</NavLink>
                        </form>
                    </div>

                    <div className="login" id="commissioner">
                        <form className="in">
                            <h5 className='mb-3'>Election Commissioner Login</h5>
                            <div className="input-group">
                                <div className="input-group-prepend">
                                    <span class="input-group-text">Commissioner Id</span>
                                </div>
                                <input type="text" aria-label="First name" className="form-control" />
                            </div>
                            <br />

                            <div className="input-group">
                                <div className="input-group-prepend">
                                    <span class="input-group-text">Password</span>
                                </div>
                                <input type="text" aria-label="First name" className="form-control" />
                            </div>
                            <br />
                            <ReCAPTCHA sitekey="6LfHwmUpAAAAAEI7G0ERpYeqzhHSKVPm81hTvp11" id="captcha" />

                            <Link to="electioncommissionerportal">
                                <button>Log In</button>
                            </Link>

                            <NavLink to={''} className="link1">Forgot Password?</NavLink>
                        </form>
                    </div>
                </div>
            }

            <div className="logo" id="d1"></div>
            <div className="logo" id="d2"></div>
            <div className="logo" id="d3"></div>
            <div className="logo" id="d4"></div>
            <div className="logo" id="d5"></div>
            <div className="logo" id="d6"></div>
            <div className="logo" id="d7"></div>

            <button className="btn" onClick={() => setHide(!hide)}>Other Login</button>
        </div>
    );
}

export default Login;