<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Marriott Danang Reservation Table</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <section id="reservationtable">
        <h1>Booking</h1>
        <form action="#" method="post">
            <div class="form-group">
                <label for="checkin">Check in</label>
                <input type="date" id="checkin" name="checkin">
            </div>
            <div class="form-group">
                <label for="checkout">Check out</label>
                <input type="date" id="checkout" name="checkout">
            </div>
            <div class="form-group">
                <label for="roomtype">Room type</label>
                <select id="roomtype" name="roomtype">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <!-- Add more options as needed -->
                </select>
            </div>
            <div class="form-group">
                <label for="adults">Alduts</label>
                <select id="adults" name="adults">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <!-- Add more options as needed -->
                </select>
            </div>
            <button type="submit">Book room</button>
        </form>
    </section>
</body>
</html>
