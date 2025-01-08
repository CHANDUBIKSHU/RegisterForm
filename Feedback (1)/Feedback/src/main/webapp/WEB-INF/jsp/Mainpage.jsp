<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Anonymous Student Feedback Form</title>
</head>
<body>
    <h2>Anonymous Student Feedback Form</h2>
    <form action="submitFeedback" method="post">
        <label for="subject">Subject Name: Kananada</label><br>

        <label for="teachingStyle">Overall Rating:</label><br>
        <select id="teachingStyle" name="ratingkannada" required>
            <option value="1">1 - Very Poor</option>
            <option value="2">2 - Poor</option>
            <option value="3">3 - Average</option>
            <option value="4">4 - Good</option>
            <option value="5">5 - Excellent</option>
        </select><br><br>

        
         <label for="subject">Subject Name: English</label><br>

        <label for="teachingStyle">Overall Rating:</label><br>
        <select id="teachingStyle" name="ratingenglish" required>
            <option value="1">1 - Very Poor</option>
            <option value="2">2 - Poor</option>
            <option value="3">3 - Average</option>
            <option value="4">4 - Good</option>
            <option value="5">5 - Excellent</option>
        </select><br><br>

         <label for="subject">Subject Name: Hindhi</label><br>

        <label for="teachingStyle">Overall Rating:</label><br>
        <select id="teachingStyle" name="ratinghindhi" required>
            <option value="1">1 - Very Poor</option>
            <option value="2">2 - Poor</option>
            <option value="3">3 - Average</option>
            <option value="4">4 - Good</option>
            <option value="5">5 - Excellent</option>
        </select><br><br>

         <label for="subject">Subject Name: Social</label><br>

        <label for="teachingStyle">Overall Rating:</label><br>
        <select id="teachingStyle" name="ratingsocial" required>
            <option value="1">1 - Very Poor</option>
            <option value="2">2 - Poor</option>
            <option value="3">3 - Average</option>
            <option value="4">4 - Good</option>
            <option value="5">5 - Excellent</option>
        </select><br><br>
        
         <label for="subject">Subject Name: Science</label><br>

        <label for="teachingStyle">Overall Rating:</label><br>
        <select id="teachingStyle" name="ratingscience" required>
            <option value="1">1 - Very Poor</option>
            <option value="2">2 - Poor</option>
            <option value="3">3 - Average</option>
            <option value="4">4 - Good</option>
            <option value="5">5 - Excellent</option>
        </select><br><br>
        
         <label for="subject">Subject Name: Mathemetics</label><br>

        <label for="teachingStyle">Overall Rating:</label><br>
        <select id="teachingStyle" name="ratingmath" required>
            <option value="1">1 - Very Poor</option>
            <option value="2">2 - Poor</option>
            <option value="3">3 - Average</option>
            <option value="4">4 - Good</option>
            <option value="5">5 - Excellent</option>
        </select><br><br>

        

        <input type="submit" value="Submit">
    </form>
</body>
</html>
