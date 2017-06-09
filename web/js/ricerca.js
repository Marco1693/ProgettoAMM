/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function createElement(user){
    
    var name = $("<h2>").html(user.nome);
    var link = $("<a>")
            .attr("href", "Bacheca?user="+user.id)
            .html(user.nome+ user.cognome);
    
    var userData = $("<div>")
            .attr("class","userData")
            .append(name)
            .append(link);
    
    return $("<div>")
            .attr("class","user")
            .append(userData);
}

function stateSuccess(data){
    var userListPage = $("#userList");
    
    $(userListPage).empty();
    for(var instance in data){
        $(userListPage).append(createElement(data[instance]));
    }
}
function stateFailure(data, state){
    console.log(state + data);
}

$(document).ready(function(){
    $("#searchYourUser").click(function(){ //bottone
        
        var wantedUser = $("#searchField")[0].value; //campotesto
        
        $.ajax({
            url: "Filter",
            data:{
                cmd:"search",
                nomeUtenteCercato: wantedUser
            },
            dataType:"json",
            success: function(data, state){
                stateSuccess(data)
            },
            error: function(data, state){
                stateFailure(data, state)
            }
        });
    })
});
