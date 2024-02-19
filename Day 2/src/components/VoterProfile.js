import { useNavigate } from "react-router-dom";
import './css/voterprofile.css';
import { useState } from "react";
import img1 from './images/no-photo.png';

const VoterProfile = () => {
    const [hide, setHide] = useState(false);
    const navigate = useNavigate();
    const cancel = () => {
        navigate('/voterportal');
    }

    return (
        <div className="sign">
            <div className='title'>

            </div>

            <form class="was-validated">
                <div className='signupform edit1' id='vs1'>
                    <div id='heading'>
                        <h1>Voter Details</h1>
                    </div>
                    <div class="mb-3" id='fname'>
                        <label for="fname1">First Name</label>
                        <input type='text' class="form-control is-invalid" id="fname1" placeholder="Enter Your First Name..." required />
                    </div>

                    <div class="mb-3" id='lname'>
                        <label for="lname1">Last Name</label>
                        <input type='text' class="form-control is-invalid" id="lname1" placeholder="Enter Your Last Name..." required />
                    </div>

                    <div class="mb-3" id='dobdiv'>
                        <div class="input-group is-invalid">
                            <div class="input-group-prepend">
                                <label class="input-group-text" for='dob'>Date of Birth</label>
                            </div>
                            <input type="date" class="form-control is-invalid" id='dob' aria-describedby="validatedInputGroupPrepend" value={'2000-06-01'} />
                        </div>
                    </div>

                    <div class="mb-3" id='agediv'>
                        <div class="input-group is-invalid">
                            <div class="input-group-prepend">
                                <label class="input-group-text" for='age'>Age</label>
                            </div>
                            <input type="number" class="form-control is-invalid" id='age' value={'23'} aria-describedby="validatedInputGroupPrepend" />
                        </div>
                    </div>

                    <div class="mb-3" id='gendiv'>
                        <div class="input-group is-invalid">
                            <div class="input-group-prepend">
                                <label class="input-group-text" for='age'>Gender</label>
                            </div>
                            <input type="text" class="form-control is-invalid" id='gen1' value={'Male'} aria-describedby="validatedInputGroupPrepend" />
                        </div>
                    </div>

                    <div class="mb-3" id='castediv'>
                        <div class="input-group is-invalid">
                            <div class="input-group-prepend">
                                <label class="input-group-text" for='caste'>Caste</label>
                            </div>
                            <input type="text" class="form-control is-invalid" id='caste' value={'Hindu'} aria-describedby="validatedInputGroupPrepend" />
                        </div>
                    </div>

                    <div class="mb-3" id='citydiv'>
                        <div class="input-group is-invalid">
                            <div class="input-group-prepend">
                                <label class="input-group-text" for='city'>City</label>
                            </div>
                            <input type="text" class="form-control is-invalid" id='city' aria-describedby="validatedInputGroupPrepend" required />
                        </div>
                    </div>

                    <div class="mb-3" id='statediv'>
                        <div class="input-group is-invalid">
                            <div class="input-group-prepend">
                                <label class="input-group-text" for='state'>State</label>
                            </div>
                            <input type="text" class="form-control is-invalid" id='state' aria-describedby="validatedInputGroupPrepend" required />
                        </div>
                    </div>

                    <div class="mb-3" id='address'>
                        <label for="addr">Address</label>
                        <textarea class="form-control is-invalid" id="addr" placeholder="Edit Address....." required />
                    </div>
                </div>

                <div className='signupform edit2' id='vs2'>
                    <div class="mb-3" id='aadhar'>
                        <label for="aadhar1">Aadhar Number</label>
                        <input type='number' class="form-control is-invalid" id="aadhar1" value={'1235365466566'} />
                    </div>

                    <div class="mb-3" id='mobile'>
                        <label for="mobile1">Mobile Number</label>
                        <input type='number' class="form-control is-invalid" id="mobile1" placeholder="Enter Your Mobile Number..." required />
                    </div>

                    <div class="mb-3" id='email'>
                        <label for="email1">Email</label>
                        <input type='email' class="form-control is-invalid" id="email1" placeholder="Enter Your Email..." required />
                    </div>

                    {!hide &&
                        <div class="custom-file mb-3" id='photo'>
                            <input type="file" class="custom-file-input" id="photo1" required />
                            <label class="custom-file-label" for="photo1">Choose Photo...</label>
                        </div>
                    }

                    <button className="btn">Save</button>
                    <button className="btn" id='b1' onClick={cancel} type='button'>Cancel</button>
                    <button className="btn" id='b2' onClick={() => setHide(!hide)} type='button'>Voter Id Card</button>
                </div>
            </form>

            {
                hide &&
                <div className="voterid">
                    <div id="d1">
                        <div id="photo">
                        <img src={img1} alt="John" />
                        </div>
                        <h1>John Doe</h1>
                        <p class="title">CEO & Founder, Example</p>
                        <p>Harvard University</p>
                        <p><button>Contact</button></p>
                        <button className="btn" id='b2' onClick={() => setHide(!hide)} type='button'>Close</button>
                    </div>
                </div>
            }
        </div>
    );
}

export default VoterProfile;