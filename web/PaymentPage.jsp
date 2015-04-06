<%-- 
    Document   : PaymentPage
    Created on : Apr 5, 2015, 6:29:49 PM
    Author     : S519459
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <link rel="stylesheet" href="PaymentStyle.css" type="text/css">
                <script src="PaymentScript.js" type="text/javascript"></script>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
                <link rel="stylesheet" href="AlertCss.css" type="text/css">

    </head>
    <body >
          <div id="tile"> 
              <p id="iteminfo"> Item Information</p>
              <div id="itemdesc">
             <c:out value="${ITEM.getShortDescription()}"/>  
      <p id="quan">Quantity :   $ <span id="quanspan"><c:out value="${quantity}"/></span></p>
      <p id="quan">Price    :   $ <span id="price"><c:out value="${totalPrice}"/></span></p>
        </div>
        <p id="iteminfo">Address Information</p>

        <div id="tabaddress">
         <table>
             
             <tbody>               
              
              <tr>
                 </tr>
                 <tr>
                     <td>&nbsp;</td>
                 </tr>
                 <tr>
                     <td>Name*</td>
                     <td><input type="text" required id="name" ></td>
                 </tr>
                 <tr>
                     <td>&nbsp;</td>
                 </tr> 
                   <tr>
                     <td>Address Line1</td>
                     <td><input type="text" id="address1" ></td>
                 </tr>
                 <tr>
                     <td>&nbsp;</td>
                 </tr>
                 <tr>
                     <td>Address Line2</td>
                     <td><input type="text" id="address2" ></td>
                 </tr>
                 <tr>
                     <td>&nbsp;</td>
                 </tr>
                 <tr>
                     <td>City</td>
                     <td><input type="text" id="city" ></td>
                 </tr>
                 <tr>
                     <td>&nbsp;</td>
                 </tr>
                 <tr>
                     <td>Province/State</td>
                     <td><select>
        <option value="SL">Select</option>                     
	<option value="AL">Alabama</option>
	<option value="AK">Alaska</option>
	<option value="AZ">Arizona</option>
	<option value="AR">Arkansas</option>
	<option value="CA">California</option>
	<option value="CO">Colorado</option>
	<option value="CT">Connecticut</option>
	<option value="DE">Delaware</option>
	<option value="DC">District Of Columbia</option>
	<option value="FL">Florida</option>
	<option value="GA">Georgia</option>
	<option value="HI">Hawaii</option>
	<option value="ID">Idaho</option>
	<option value="IL">Illinois</option>
	<option value="IN">Indiana</option>
	<option value="IA">Iowa</option>
	<option value="KS">Kansas</option>
	<option value="KY">Kentucky</option>
	<option value="LA">Louisiana</option>
	<option value="ME">Maine</option>
	<option value="MD">Maryland</option>
	<option value="MA">Massachusetts</option>
	<option value="MI">Michigan</option>
	<option value="MN">Minnesota</option>
	<option value="MS">Mississippi</option>
	<option value="MO">Missouri</option>
	<option value="MT">Montana</option>
	<option value="NE">Nebraska</option>
	<option value="NV">Nevada</option>
	<option value="NH">New Hampshire</option>
	<option value="NJ">New Jersey</option>
	<option value="NM">New Mexico</option>
	<option value="NY">New York</option>
	<option value="NC">North Carolina</option>
	<option value="ND">North Dakota</option>
	<option value="OH">Ohio</option>
	<option value="OK">Oklahoma</option>
	<option value="OR">Oregon</option>
	<option value="PA">Pennsylvania</option>
	<option value="RI">Rhode Island</option>
	<option value="SC">South Carolina</option>
	<option value="SD">South Dakota</option>
	<option value="TN">Tennessee</option>
	<option value="TX">Texas</option>
	<option value="UT">Utah</option>
	<option value="VT">Vermont</option>
	<option value="VA">Virginia</option>
	<option value="WA">Washington</option>
	<option value="WV">West Virginia</option>
	<option value="WI">Wisconsin</option>
	<option value="WY">Wyoming</option>
</select></td>
                 </tr>
                 <tr>
                     <td>&nbsp;</td>
                 </tr>
                 <tr>
                     <td>Postal/Zip code</td>
                     <td><input type="text" id="zipcode" ></td>
                 </tr>
                 <tr>
                     <td>&nbsp;</td>
                 </tr>
                 <tr>
                     <td>Country</td>
                     <td><input type="text" id="country" ></td>
                 </tr> 
                 <tr>
                     <td>&nbsp;</td>
                 </tr>
                 <tr>
                     <td>Phone Number* </td>
                     <td><input type="text" required id="phone" ></td>
                 </tr>
                 <tr>
                     <td>&nbsp;</td>
                 </tr>
                 <tr>
                     <td>Email *</td>
                     <td><input type="email" required id="email" ></td>
                 </tr> 
             </tbody>
      </table>
      </div>
                  </div>

                          <div id="paymentdiv"> 
        <div id="paymentinfo">Payment Information</div>
        <div id="paymentdiv2">
         <table border="0" >
             
             <tbody>
                 
                 <tr>
                     <td>&nbsp;</td>
                 </tr>
                 <tr>
                     <td>Amount *</td>
                     <td><input type="text" required id="amount" ></td>
                 </tr>
                 <tr>
                     <td>&nbsp;</td>
                 </tr>
                   <tr>
                     <td>Name On Card* </td>
                     <td><input type="text" required id="nameoncard" ></td>
                 </tr>
                 <tr>
                     <td>&nbsp;</td>
                 </tr>
                 <tr>
                     <td>Card Type* </td>
                     <td><select>
                            <option value="select">Select</option>
                             <option value="volvo">Visa Card</option>
                            <option value="saab">Master Card</option>
                             <option value="opel">Debit Card</option>
                             <option value="audi">Credit Card</option>
                            </select></td>
                 </tr> 
                 <tr>
                     <td>&nbsp;</td>
                 </tr>
                 <tr>
                     <td>Card Number* </td>
                     <td><input type="text" required id="cardnumber" ></td>
                 </tr>
                 <tr>
                     <td>&nbsp;</td>
                 </tr>
                 <tr>
                     <td>Expiration Date* </td>
                     <td><select name='' id='expireMM'>
                                <option value=''>Month</option>
                                <option value='01'>Janaury</option>
                                <option value='02'>February</option>
                                <option value='03'>March</option>
                                <option value='04'>April</option>
                                <option value='05'>May</option>
                                <option value='06'>June</option>
                                <option value='07'>July</option>
                                <option value='08'>August</option>
                                <option value='09'>September</option>
                                <option value='10'>October</option>
                                <option value='11'>November</option>
                                <option value='12'>December</option>
                            </select>
                        <select name='' id='expireYY'>
                                   <option value=''>Year</option>
                                   <option value='10'>2014</option>
                                   <option value='11'>2015</option>
                                   <option value='12'>2016</option>
                                   <option value='13'>2017</option>
                                   <option value='14'>2018</option>
                                   <option value='15'>2019</option>
                                   <option value='16'>2020</option>
                                   <option value='17'>2021</option>
                                   <option value='18'>2022</option>
                               </select> </td>
                 </tr> 
              
             </tbody>
             
         </table>
  </div>
        </div>
           <div id="button">
            <input type="submit" class="btn"  onclick="alert('Your order will be delivered soon');"  value="Submit Payment"/></td>
           </div>
        </body>
</html>