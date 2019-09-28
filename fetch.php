<?php
$conn = mysqli_connect('localhost','root','sanju123','my_first_schema');

if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

$sql = "select * from EMP_DETAILS";
$result = mysqli_query($conn, $sql);
mysqli_close($conn);
?>

<?DOCTYPE html>
<head>
  <title>Your Profile</title>
</head>
<body>
<table align="center" border="1px" style="width: 600px; height:100px;">
	<tr>
          <th colspan=5>
            <h2>Employee details</h2>
          </th>
        </tr>
	<t>
	 <th style="width:100px;"> ID &nbsp;</th>
	 <th style="width:150px;"> Name &nbsp; </th>
	 <th style="width:150px;"> Contact &nbsp;</th>
	 <th style="width:100px;"> Password &nbsp;</th>
	 <th style="width:100px;"> Registration Date</th> 
	</t> 
   <?php
     if (mysqli_num_rows($result) > 0) 
     {
	while($row = mysqli_fetch_assoc($result))
	{
   ?>
	<tr>
	  <td><?php echo $row['EMPID']; ?></td>
	  <td><?php echo $row['NAME']; ?></td>
	  <td><?php echo $row['CONTACT']; ?></td>
	  <td><?php echo $row['PASSWORD']; ?></td>
	  <td><?php echo $row['DT']; ?></td>
 	</tr>
      <?php
        }
     }
     else
     {
       echo "0 results";
     }
      ?>
 </table>
</body>
</html>