 <%@ page import= "DAOLayer.* , java.util.*" %>
<html>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js"></script>
<body>
<% 
   HashMap<String,Integer> list = (HashMap<String,Integer>)WidgetCountListVC.doListVoterCandidates();
%>
<canvas id="myChart" style="width:100%;max-width:600px"></canvas>

<script>
var voter = <%= list.get(WidgetCountListVC.voterkey) %>
var candidate = <%= list.get(WidgetCountListVC.candidatekey) %>
var xValues = ["Voters", "Candidates"];
var yValues = [voter, candidate];
var barColors = [
  "#b91d47",
  "#00aba9"
];

new Chart("myChart", {
  type: "pie",
  data: {
    labels: xValues,
    datasets: [{
      backgroundColor: barColors,
      data: yValues
    }]
  },
  options: {
    title: {
      display: true,
      text: "Widget Chart for number of Voters and Candidates.."
    }
  }
});
</script>