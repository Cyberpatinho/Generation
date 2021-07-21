content = document.querySelectorAll(".content");

function selectContent(id) {
    for(let i = 0; i < content.length; i++){
        if(content[i].id == id){
            content[i].style.display = "flex";
        }
        else{
            content[i].style.display = "none";
        }
    }
}