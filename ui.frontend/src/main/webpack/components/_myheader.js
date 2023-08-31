/*const slides = document.querySelectorAll('.slide');
let currentSlide = 0;

slides.forEach(
    (slide, index) => {
        slide.style.left = '${index * 100}%'

    }
)

const showSlide = () => {
    slides.forEach(
        (slide) => {
            slide.style.transform = 'translateX(-${currentSlide * 100}%)'
        })
}

const nextSlide = () => {
    currentSlide++
    showSlide();
}

const prevSlide = () => {
    currentSlide--
    showSlide();
}


let slideIndex = 1;
showSlides(slideIndex);

// Next/previous controls
function plusSlides(n) {
  showSlides(slideIndex += n);
}

// Thumbnail image controls
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  if (n > x.length) {slideIndex = 1}
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  x[slideIndex-1].style.display = "block";  
}
}
}
}*/