

(function() {
    "use strict";
        window.addEventListener("scroll", function(){
        const listItems = document.querySelectorAll('.cmp-statistics__content__inactive')
           
        Array.from(listItems).forEach((links) => {
            console.log("inside loop", links);
            
            const position = links.getBoundingClientRect();
            console.log(position);
        
                if(position.top > 400){          
                    links.classList.remove("active");
                }
                if(position.top < 400){
                    links.classList.add("active");
                }
                if(position.top <90 && position.width > 400){
                    links.classList.remove("active");
                }
                
                if(position.top <30 && position.width < 400){
                    links.classList.remove("active"); 
                }
            });
    });
}());
