/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function checkPassword() {
                var pwd = document.getElementById("pass").value;
                var cpwd = document.getElementById("cPass").value;
                if (pwd !== cpwd) {
                    alert('Password not matched');
                }
            }


