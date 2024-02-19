import { useEffect, useState } from 'react';
import './css/executiveportal.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import img5 from './images/profile.png';
import img6 from './images/switch.png';
import { Link, useNavigate } from 'react-router-dom';

const ElectionCommissionerPortal = () => {
    const [date, setDate] = useState(new Date());
    const [exit, setExit] = useState(false);
    const navigate = useNavigate();

    useEffect(() => {
        const timer = setInterval(() => {
            setDate(new Date());
        }, 1000);

        return () => {
            clearInterval(timer);
        };
    }, []);

    const logOut = () => {
        navigate('/');
    }

    return (
        <div className="votermain">
            <div className='title'>

            </div>

            <div className='news'>

            </div>

            <div className='datetime'>
                <h5>{date.toDateString()} : {date.toLocaleTimeString()}</h5>
            </div>

            <div className='portal'>
                <h5>Election Commissioner Portal</h5>
            </div>

            <Link to={'commissionerprofile'}>
                <div className='useraction' id='profile'>
                    <img src={img5} />
                    <h5>Profile</h5>
                </div>
            </Link>

            <div className='useraction' id='logout' onClick={() => setExit(!exit)}>
                <img src={img6} />
                <h5>Log Out</h5>
            </div>

            {
                exit &&
                <div className='exit'>
                    <div id='box'>
                        <h4>Do you want logout ??</h4>
                        <button className="btn" id='yes' onClick={logOut}>Yes</button>
                        <button className="btn" id='no' onClick={() => setExit(!exit)}>No</button>
                    </div>
                </div>
            }
        </div >
    );
}

export default ElectionCommissionerPortal;