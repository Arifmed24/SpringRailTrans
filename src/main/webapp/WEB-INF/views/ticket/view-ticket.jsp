<%@include file="/WEB-INF/views/header.jsp"%>
<div class="main_body">
    <section>
        <div class="body_header">
            <h1> Ticket</h1>
        </div>
        <div class="rr_table">
            <table>
                <tr>
                    <th>Field</th>
                    <th>Description</th>
                </tr>
                <tr>
                    <td>Passenger</td>
                    <td>${ticket.ticketPassenger.firstName} ${ticket.ticketPassenger.lastName}</td>
                </tr>
                <tr>
                    <td>Station departure</td>
                    <td>${ticket.departureStation.stationName}</td>
                </tr>
                <tr>
                    <td>Date departure</td>
                    <td>${ticket.departureDate}</td>
                </tr>
                <tr>
                    <td>Station arrival</td>
                    <td>${ticket.arrivalStation.stationName}</td>
                </tr>
                <tr>
                    <td>Date arrival</td>
                    <td>${ticket.arrivalDate}</td>
                </tr>
                <tr>
                    <td>Train</td>
                    <td>${ticket.ticketTrain.idTrain}</td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td>${ticket.price} RUB</td>
                </tr>
            </table>
            <div class="rr_new_button">
                <div class="btn-primary">
                    <a href="/user/tickets">My tickets</a>
                </div>
            </div>
        </div>
    </section>
</div>
<%@include file="/WEB-INF/views/bottom.jsp"%>