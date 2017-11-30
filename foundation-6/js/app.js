$(document).foundation()
function openCity(evt, cityName) {
    // Declare all variables
    var i, tabcontent, tablinks;

    // Get all elements with class="tabcontent" and hide them
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }

    // Get all elements with class="tablinks" and remove the class "active"
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }

    // Show the current tab, and add an "active" class to the link that opened the tab
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";
// Write JavaScript here

    function openCity(evt, cityName) {
        var i, tabcontent, tablinks;
        tabcontent = document.getElementsByClassName("tabcontent");
        for (i = 0; i < tabcontent.length; i++) {
            tabcontent[i].style.display = "none";
        }
        tablinks = document.getElementsByClassName("tablinks");
        for (i = 0; i < tablinks.length; i++) {
            tablinks[i].className = tablinks[i].className.replace(" active", "");
        }
        document.getElementById(cityName).style.display = "block";
        evt.currentTarget.className += " active";
    }
};
$(document).ready(function(){
  var currentIndex = 0,
   items = $('.container div'),
   itemAmt = items.length;

  function cycleItems() {
   var item = $('.container div').eq(currentIndex);
   items.hide();
   item.css('display','inline-block');
   }


  var autoSlide = setInterval(function(){
   currentIndex += 1;
   if (currentIndex > itemAmt - 1) {
     currentIndex = 0;
   }
   cycleItems();
  }, 3000);

  $('.next').click(function() {
   clearInterval(autoSlide);
   currentIndex += 1;
   if (currentIndex > itemAmt - 1) {
     currentIndex = 0;
   }
   cycleItems();
  });

  $('.prev').click(function() {
   clearInterval(autoSlide);
   currentIndex -= 1;
   if (currentIndex < 0) {
     currentIndex = itemAmt - 1;
   }
   cycleItems();
  });
});
