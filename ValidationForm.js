
function validation()
{
    debugger;
    var username=document.getElementById("username").value;
    var email=document.getElementById("email").value;
    var password=document.getElementById("password").value;
    password=document.getElementById("confirmpassword").value;

    // document.getElementById("usernameError").textContent="";
    // // document.getElementById("emailError").textContent="";
    // // document.getElementById("passwordError").textContent="";
    // // document.getElementById("confirmpasswordError").textContent="";

    //validate username
    if(username===" " ||username===undefined)
        {
        document.getElementById("usernameError").textContent="username required";
            return false;
        }

    //validate email
    if(email===" " ||email===undefined)
    {
        document.getElementById("emailError").textContent="email required";
            return false;
    }

    //validate password
    if(password===" " ||password===undefined)
        {
            document.getElementById("passwordError").textContent="password required";
                return false;
        }

    //validate confirmpassword
    if(confirmpassword===" " ||confirmpassword===undefined)
        {
            document.getElementById("confirmpasswordError").textContent="confirmpassword required";
                return false;
        }if(confirmpassword!=password){
            document.getElementById("confirmpasswordError").textContent="confirmpassword is not matching with password";
                return false;
        }
        return true;
}
