import React from "react";
import { useFormik } from "formik";
import './App.css';
const validate=values => {
  const errors ={};
  if(!values.firstname){
    errors.firstname="*Required";
  }else if(values.length>8){
    errors.firstname="must be 8 characters in length";
  }
  if(!values.lastname){
    errors.lastname="*Required";
  }else if(values.length>8){
    errors.lastname="must be 8 characters in length";
  }
  if(!values.email){
    errors.email="Required";
  }else if(!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(values.email)){
    errors.email="Invalid email";
  }
  if(!values.password){
    errors.password = "Required";
  }else if(values.password.length>8){
    errors.password= "maximum of 8 characters";
  }else if(values.password.length<3){
    errors.password ="minimum of 5 characters";
  }
  if(!values.confirmpassword){
    errors.confirmpassword ="Required";
  }else if (values.password!= values.confirmpassword){
    errors.confirmpassword="password not matched ";
  }
  return errors;
}
const App =() =>{
  const formik = useFormik({
    initialValues : {
      firstname : '',
      lastname :'',
      email : '',
      password :'',
      confirmpassword :'',
    },
    validate
  });
  console.log(formik.values);
  return(
    <div className="main">
      <div className="SignUp-form">
        <h2>Sign Up here</h2>
        <form>
          <input type="text" placeholder="First Name .." name="firstname" autoComplete="off" onChange={formik.handleChange} value={formik.values.firstname}/>
          {
            
              formik.errors.firstname? <span>formik.errors.firstname
                </span>:null
          
          }
          <input type="text" placeholder="Last Name .." name="lastname" autoComplete="off" onChange={formik.handleChange} value={formik.values.lastname}/>
            {
            
              formik.errors.lastname? <span>formik.errors.lastname
                </span>:null
          
          }
          <input type="text" placeholder="Email" name="email" autoComplete="off" onChange={formik.handleChange} value={formik.values.email}/>
            {
            
              formik.errors.email? <span>formik.errors.email
                </span>:null
          
          }
          <input type="password" placeholder="Password" name="password" autoComplete="off" onChange={formik.handleChange} value={formik.values.password}/>
           {
            
              formik.errors.password? <span>formik.errors.password
                </span>:null
          
          }
          <input type="password" placeholder="Confirm Password" name="confirmpassword" autoComplete="off" onChange={formik.handleChange} value={formik.values.confirmpassword}/>
           {
            
              formik.errors.confirmpassword? <span>formik.errors.confirmpassword
                </span>:null
          
          }
          <input type="submit" value ="submit"/>
        </form>
      </div>

    </div>
  )
}
export default App;
