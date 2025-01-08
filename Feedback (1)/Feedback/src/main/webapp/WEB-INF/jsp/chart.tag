<%@ tag language="java" pageEncoding="UTF-8"%>
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
<canvas id="feedbackChart" width="400" height="200"></canvas>
<script>
    var ctx = document.getElementById('feedbackChart').getContext('2d');
    var chart = new Chart(ctx, {
        type: 'pie', // Pie chart
        data: {
            labels: ['Pending', 'Completed'],
            datasets: [{
                label: 'Feedback Status',
                data: [5, 15], // Replace with dynamic data
                backgroundColor: ['#ff6384', '#36a2eb']
            }]
        }
    });
</script>