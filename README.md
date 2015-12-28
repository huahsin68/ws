# ws
JAX-WS code demonstration

<b>Pre-requisite:</b>
<ol>
<li>Apache Maven</li>
<li>JBoss AS or JBoss EAP</li>
<li>Eclipse IDE</li>
</ol>

<b>Steps of execution for accessing web service through Java Application:</b>
<ol>
<li>Configure JBoss Runtime under Eclipse IDE: Goto Window menu > Server > Runtime Environment > <i>pick and edit a desire server</i> > Browse for standalone-full.xml in Configuration File field.</li>
<li>Generate the JAX-WS Java artifact: In Eclipse Maven build > Goals > type <i>clean compile</i></li>
<li>Execute Publish class as Java Application.</li>
<li>Execute Client class as Java Application.</li>
</ol>

<b>Steps of execution for accessing web service through WEB:</b>
<ol>
<li>Configure JBoss Runtime under Eclipse IDE: Goto Window menu > Server > Runtime Environment > <i>pick and edit a desire server</i> > Browse for standalone-full.xml in Configuration File field.</li>
<li>Deploy the app to JBoss.</li>
<li>Launch the web: http://localhost:8080/ws1/faces/index.xhtml</li>
<li>Click on the submit button to retrieve <i>Hello World</i> string.</li>
</ol>

