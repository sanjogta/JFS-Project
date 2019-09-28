<?php

$Eid = $_POST['eid'];
$Name = $_POST['name'];
$Cont = $_POST['contact'];
$Psw = $_POST['psw'];
$Regdt = $_POST['regdt'];

 $conn = new mysqli('localhost','root','sanju123','my_first_schema');
  if($conn->connect_error)
   {
     die("Connection failed: " . $conn->connect_error);
   }
$sql = "INSERT INTO EMP_DETAILS(EMPID,NAME,CONTACT,PASSWORD,DT) VALUES('$Eid','$Name','$Cont','$Psw','$Regdt')";
if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
header("refresh:2; url=login.htm");
?>
