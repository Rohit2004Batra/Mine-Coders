document.addEventListener('DOMContentLoaded', function () {
    var hamburgerMenu = document.getElementById('hamburgerMenu');
    var sidebarMenu = document.getElementById('sidebarMenu');

    hamburgerMenu.addEventListener('click', function () {
        if (sidebarMenu.style.display === "block") {
            sidebarMenu.style.display = "none";
        } else {
            sidebarMenu.style.display = "block";
        }
    });

    var slideshowElement = document.getElementById('slideshow');
    var slideshow = new bootstrap.Carousel(slideshowElement, {
        interval: 2000, // 1 second interval
        ride: 'carousel'
    });


        // Hide sidebar when cancel button is clicked
        cancelButton.addEventListener('click', function () {
            sidebarMenu.style.display = "none";
        });
    
        // Close sidebar when clicking outside of it
        document.addEventListener('click', function (event) {
            if (!sidebarMenu.contains(event.target) && event.target !== hamburgerMenu) {
                sidebarMenu.style.display = "none";
            }
        });
});
