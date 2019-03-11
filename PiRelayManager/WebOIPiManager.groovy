/**
 *  WebOIPi Manager
 *
 *  Copyright 2016 iBeech
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 * 	==== INSTRUCTIONS ===
	1) For UK go to: https://graph-eu01-euwest1.api.smartthings.com
	2) For US go to: https://graph.api.smartthings.com
	3) Click 'My SmartApps'
	4) Click the 'From Code' tab
	5) Paste in the code from here, into SmartThings
	6) Click 'Create'
	7) Click 'Publish -> For Me'

 * 
 */
definition(
    name: "WebOIPi Manager",
    namespace: "Kalltech",
    author: "ibeech",
    description: "Add each Pi Relay as an individual thing.",
    category: "Safety & Security",
    iconUrl: "https://cdn1.iconfinder.com/data/icons/system-shade-circles/512/raspberry-64.png",
    iconX2Url: "https://cdn1.iconfinder.com/data/icons/system-shade-circles/512/raspberry-128.png",
    iconX3Url: "https://cdn1.iconfinder.com/data/icons/system-shade-circles/512/raspberry-512.png")


preferences {

  section("Raspberry Pi Setup"){
  	input "piIP", "text", "title": "Raspberry Pi IP", multiple: false, required: true
    input "piPort", "number", "title": "Raspberry Pi Port", multiple: false, required: true
    input "piPolling", "number", "title": "Polling time for Switchs & Contacts sensors in seconds", multiple: false, required: true
    input "theHub", "hub", title: "On which hub?", multiple: false, required: true
    input "piUser","text", "title": "User", multiple: false, required: false
    input "piPsswd","text", "title": "Password", multiple: false, required: false
      input (
          name: "configLoggingLevelIDE",
          title: "IDE Live Logging Level:\nMessages with this level and higher will be logged to the IDE.",
          type: "enum",
          options: [
              "0" : "None",
              "1" : "Error",
              "2" : "Warning",
              "3" : "Info",
              "4" : "Debug",
              "5" : "Trace"
          ],
          defaultValue: "5",
          displayDuringSetup: true,
          required: false
      )
  }
  
    section("Device 1") {    
		input "deviceName1", "text", title: "Device Name", required:false	        
        input "deviceType1", "enum", title: "Device Type", required: false, options: [                
                "switch":"Relay Switch",
		"switchReversed":"Relay Switch Reversed",
                "contact":"Contact Sensor",
                "temperatureSensor":"Temperature Sensor"]
        input "deviceConfig1", "text", title: "GPIO# or Device Name", required: false
    }
    section("Device 2") {    
		input "deviceName2", "text", title: "Device Name", required:false	        
        input "deviceType2", "enum", title: "Device Type", required: false, options: [                
                "switch":"Relay Switch",
		"switchReversed":"Relay Switch Reversed",
                "contact":"Contact Sensor",
                "temperatureSensor":"Temperature Sensor"]
        input "deviceConfig2", "text", title: "GPIO# or Device Name", required: false
    }  
    section("Device 3") {    
		input "deviceName3", "text", title: "Device Name", required:false	        
        input "deviceType3", "enum", title: "Device Type", required: false, options: [                
                "switch":"Relay Switch",
		"switchReversed":"Relay Switch Reversed",
                "contact":"Contact Sensor",
                "temperatureSensor":"Temperature Sensor"]
        input "deviceConfig3", "text", title: "GPIO# or Device Name", required: false
    }      
    section("Device 4") {    
		input "deviceName4", "text", title: "Device Name", required:false	        
        input "deviceType4", "enum", title: "Device Type", required: false, options: [                
                "switch":"Relay Switch",
		"switchReversed":"Relay Switch Reversed",
                "contact":"Contact Sensor",
                "temperatureSensor":"Temperature Sensor"]
        input "deviceConfig4", "text", title: "GPIO# or Device Name", required: false
    }          
    section("Device 5") {    
		input "deviceName5", "text", title: "Device Name", required:false	        
        input "deviceType5", "enum", title: "Device Type", required: false, options: [                
                "switch":"Relay Switch",
		"switchReversed":"Relay Switch Reversed",
                "contact":"Contact Sensor",
                "temperatureSensor":"Temperature Sensor"]
        input "deviceConfig5", "text", title: "GPIO# or Device Name", required: false
    }    
    section("Device 6") {    
		input "deviceName6", "text", title: "Device Name", required:false	        
        input "deviceType6", "enum", title: "Device Type", required: false, options: [                
                "switch":"Relay Switch",
		"switchReversed":"Relay Switch Reversed",
                "contact":"Contact Sensor",
                "temperatureSensor":"Temperature Sensor"]
        input "deviceConfig6", "text", title: "GPIO# or Device Name", required: false
    }    
    section("Device 7") {    
		input "deviceName7", "text", title: "Device Name", required:false	        
        input "deviceType7", "enum", title: "Device Type", required: false, options: [                
                "switch":"Relay Switch",
		"switchReversed":"Relay Switch Reversed",
                "contact":"Contact Sensor",
                "temperatureSensor":"Temperature Sensor"]
        input "deviceConfig7", "text", title: "GPIO# or Device Name", required: false
    }   
    section("Device 8") {    
		input "deviceName8", "text", title: "Device Name", required:false	        
        input "deviceType8", "enum", title: "Device Type", required: false, options: [                
                "switch":"Relay Switch",
		"switchReversed":"Relay Switch Reversed",
                "contact":"Contact Sensor",
                "temperatureSensor":"Temperature Sensor"]
        input "deviceConfig8", "text", title: "GPIO# or Device Name", required: false
    }        
    section("Device 9") {    
		input "deviceName9", "text", title: "Device Name", required:false	        
        input "deviceType9", "enum", title: "Device Type", required: false, options: [                
                "switch":"Relay Switch",
		"switchReversed":"Relay Switch Reversed",
                "contact":"Contact Sensor",
                "temperatureSensor":"Temperature Sensor"]
        input "deviceConfig9", "text", title: "GPIO# or Device Name", required: false
    }        
    section("Device 10") {    
		input "deviceName10", "text", title: "Device Name", required:false	        
        input "deviceType10", "enum", title: "Device Type", required: false, options: [                
                "switch":"Relay Switch",
		"switchReversed":"Relay Switch Reversed",
                "contact":"Contact Sensor",
                "temperatureSensor":"Temperature Sensor"]
        input "deviceConfig10", "text", title: "GPIO# or Device Name", required: false
    }  
}

def installed() {
  logger("Installed with settings: ${settings}","debug")

  initialize()
}

def initialize() {
    // Update internal state:
    state.loggingLevelIDE = (settings.configLoggingLevelIDE) ? settings.configLoggingLevelIDE.toInteger() : 5

    subscribe(location, null, response, [filterEvents:false])
    
    unschedule()
    runEvery1Minute(Schedule_updateGPIOState)
    Schedule_updateGPIOState()
   
	setupVirtualRelay(deviceName1, deviceType1, deviceConfig1);
    setupVirtualRelay(deviceName2, deviceType2, deviceConfig2);
    setupVirtualRelay(deviceName3, deviceType3, deviceConfig3);
    setupVirtualRelay(deviceName4, deviceType4, deviceConfig4);
    setupVirtualRelay(deviceName5, deviceType5, deviceConfig5);
    setupVirtualRelay(deviceName6, deviceType6, deviceConfig6);
    setupVirtualRelay(deviceName7, deviceType7, deviceConfig7);
    setupVirtualRelay(deviceName8, deviceType8, deviceConfig8);
    setupVirtualRelay(deviceName9, deviceType9, deviceConfig9);
    setupVirtualRelay(deviceName10, deviceType10, deviceConfig10);
}

def updated() {
log.info "loggingLevelIDE:$state.loggingLevelIDE"
    // Update internal state:
    state.loggingLevelIDE = (settings.configLoggingLevelIDE) ? settings.configLoggingLevelIDE.toInteger() : 5
log.info "loggingLevelIDE:$state.loggingLevelIDE"
    
	logger("Updated with settings: ${settings}","debug")
    unschedule()
    runEvery1Minute(Schedule_updateGPIOState)
    Schedule_updateGPIOState()
    unsubscribe();
    
    updateVirtualRelay(deviceName1, deviceType1, deviceConfig1);
    updateVirtualRelay(deviceName2, deviceType2, deviceConfig2);    
    updateVirtualRelay(deviceName3, deviceType3, deviceConfig3);
    updateVirtualRelay(deviceName4, deviceType4, deviceConfig4);
    updateVirtualRelay(deviceName5, deviceType5, deviceConfig5);
    updateVirtualRelay(deviceName6, deviceType6, deviceConfig6);
    updateVirtualRelay(deviceName7, deviceType7, deviceConfig7);
    updateVirtualRelay(deviceName8, deviceType8, deviceConfig8);
    updateVirtualRelay(deviceName9, deviceType9, deviceConfig9);
    updateVirtualRelay(deviceName10, deviceType10, deviceConfig10);
    
    subscribe(location, null, response, [filterEvents:false])
}

def updateVirtualRelay(deviceName, deviceType, deviceConfig) {
    
    // If user didn't fill this device out, skip it
    if(!deviceName) return;
    
    def theDeviceNetworkId = "";
    switch(deviceType) {
    	case "switch":
        	theDeviceNetworkId = getRelayID(deviceConfig);
            break;
            
    	case "contact":
        	theDeviceNetworkId = getContactID(deviceConfig);
            break;
            
        case "temperatureSensor":
        	theDeviceNetworkId = getTemperatureID(deviceConfig);
            break;
    }
    
    logger("Searching for: $theDeviceNetworkId","trace")
    
  	def theDevice = getChildDevices().find{ d -> d.deviceNetworkId.startsWith(theDeviceNetworkId) }  
    
    if(theDevice){ // The switch already exists
		logger("Found existing device which we will now update"   ,"debug")
        theDevice.deviceNetworkId = theDeviceNetworkId //+ "." + deviceConfig
        theDevice.label = deviceName
        theDevice.name = deviceName
        
        if(deviceType == "switch") { // Actions specific for the relay device type
            subscribe(theDevice, "switch", switchChange)
			logger("Setting initial state of $deviceName to off","debug")
            setSwitchState(deviceConfig, "off", true);
            theDevice.off();
        } else if(deviceType == "contact") { // Actions specific for the contact device type
            subscribe(theDevice, "contact", contactChange)
			logger("Setting initial state of $deviceName to open","debug")
            setContactState(deviceConfig, "open", true);
            theDevice.open();
        } else {
        	updateTempratureSensor();
        }
        
    } else { // The switch does not exist
    	if(deviceName){ // The user filled in data about this switch
			logger("This device does not exist, creating a new one now","debug")
        	/*setupVirtualRelay(deviceId, gpioName);*/
            setupVirtualRelay(deviceName, deviceType, deviceConfig);
       	}
    }

}
def setupVirtualRelay(deviceName, deviceType, deviceConfig) {

	if(deviceName){
		logger(deviceName,"debug")
		logger(deviceType,"debug")
		logger(deviceConfig,"debug")
        
        switch(deviceType) {
        	case "switch":
				logger("Found a relay switch called $deviceName on GPIO #$deviceConfig","trace")
				def d = addChildDevice("Kalltech", "Virtual Pi Relay", getRelayID(deviceConfig), theHub.id, [label:deviceName, name:deviceName])
	    		subscribe(d, "switch", switchChange)
                logger("Setting initial state of $gpioName to off","debug")
        		setSwitchState(deviceConfig, "off", true);
	    		d.off();
            	break;
                    
        	case "contact":
                logger("Found a Contact contact called $deviceName on GPIO #$deviceConfig","trace")
				def d = addChildDevice("Kalltech", "Virtual Pi Contact", getContactID(deviceConfig), theHub.id, [label:deviceName, name:deviceName])
	    		subscribe(d, "contact", contactChange)
                
                logger("Setting initial state of $gpioName to open","debug")
        		setContactState(deviceConfig, "open", true);
	    		d.open();
            	break;
                    
            case "temperatureSensor":
                logger("Found a temperature sensor called $deviceName on $deviceConfig","trace")
                def d = addChildDevice("ibeech", "Virtual Pi Temperature", getTemperatureID(deviceConfig), theHub.id, [label:deviceName, name:deviceName])                 
                state.temperatureZone = deviceConfig
                updateTempratureSensor();
            	break;
        }	    
	}
}

def String getRelayID(deviceConfig) {

	return "piRelay." + settings.piIP + "." + deviceConfig
}
def String getContactID(deviceConfig) {

	return "piContact." + settings.piIP + "." + deviceConfig
}
def String getTemperatureID(deviceConfig){
    
    return  "piTemp." + settings.piIP + "." + deviceConfig
}

def uninstalled() {
  unsubscribe()
  def delete = getChildDevices()
    delete.each {
    	unsubscribe(it)
		logger("about to delete device","trace")
        deleteChildDevice(it.deviceNetworkId)
    }   
}

def response(evt){
    logger("response","debug")
    def msg = parseLanMessage(evt.description);
    if(msg && msg.body){

            // This is the GPIO headder state message
        def children = getChildDevices(false)
        if(msg.json) {
                msg.json.GPIO.each { item ->
                    updateRelayDevice(item.key, item.value.value, children);
                }
                logger("Finished Getting GPIO State","trace")
        }

        def tempContent = msg.body.tokenize('.')
        if(tempContent.size() == 2 && tempContent[0].isNumber() && tempContent[1].isNumber() ) {
            // Got temperature response            
            def networkId = getTemperatureID(state.temperatureZone);
            def theDevice = getChildDevices().find{ d -> d.deviceNetworkId.startsWith(networkId) }              
            if(theDevice) {
                theDevice.setTemperature(msg.body, state.temperatureZone);
                logger("$theDevice set to $msg.body","trace")
            }
		}
	}
}

def updateRelayDevice(GPIO, state, childDevices) {

	def theDevice = childDevices.find{ d -> d.deviceNetworkId.endsWith(".$GPIO") }  
    if(theDevice) { 
		logger("Updating $theDevice for GPIO $GPIO with value $state","debug")
        theDevice.changeState(state)
    }
}

def updateTempratureSensor() {

	logger("Updating temperature for $state.temperatureZone","info")
	
	executeRequest("/devices/" + state.temperatureZone  + "/sensor/temperature/c", "GET", false, null, true);
    
    //runIn(60, updateTempratureSensor);
}

def Schedule_updateGPIOState() {
	logger("Schedule_updateGPIOState","trace")
    def nbPolling = Math.round(60/piPolling) -1
    def Polling = piPolling
	for (i in 1..nbPolling) {
    	Polling = piPolling * i
        runIn(Polling, updateGPIOState, [overwrite: false]);
	}
    updateTempratureSensor()
}
def updateGPIOState() { 
	logger("updateGPIOState","info")
	def stamp = new Date().format('yyyy-M-d hh:mm:ss',location.timeZone)
	logger("Updating GPIO map at " + stamp,"trace")
	
	executeRequest("/*", "GET", false, null, true);
    
    //runIn(piPolling, updateGPIOState);
}

def switchChange(evt){

	logger("Switch event!","debug")
	logger(evt.value,"debug")
    if(evt.value == "on" || evt.value == "off") return;    
	
    
    def parts = evt.value.tokenize('.');
    def deviceId = parts[1];
    def GPIO = parts[5];
    def state = parts[6];
    
	logger(state,"debug")
    
    switch(state){
    	case "refresh":
        // Refresh this switches button
		logger("Refreshing the state of GPIO " + GPIO,"debug")
        executeRequest("/*", "GET", false, null, true)
        return;        
    }
    
    setSwitchState(GPIO, state, true);
    
    return;
}
def contactChange(evt){

		logger("Contact event!","debug")
		logger(evt.value,"debug")
    if(evt.value == "closed" || evt.value == "open") return;    
	
    
    def parts = evt.value.tokenize('.');
    def deviceId = parts[1];
    def GPIO = parts[5];
    def state = parts[6];
    
	logger(state,"debug")
    
    switch(state){
    	case "refresh":
        // Refresh this switches button
		logger("Refreshing the state of GPIO " + GPIO,"debug")
        executeRequest("/*", "GET", false, null, true)
        return;        
    }
    
    setContactState(GPIO, state, false);
    
    return;
}


def setSwitchState(gpio, state, PostactualAction) {
	logger("Executing 'setSwitchState'","debug")
     
    // Determine the path to post which will set the switch to the desired state
    def Path = "/GPIO/" + gpio + "/value/";
	Path += (state == "on") ? "1" : "0";
    
    executeRequest(Path, "POST", "OUT", gpio, PostactualAction);
}

def setContactState(gpio, state, PostactualAction) {
	logger("Executing 'setContactState'","debug")

    // Determine the path to post which will set the switch to the desired state
    def Path = "/GPIO/" + gpio + "/value/";
	Path += (state == "on") ? "1" : "0";
    
    executeRequest(Path, "POST", "IN", gpio, PostactualAction);
}

def executeRequest(Path, method, setGPIODirection, gpioPin, PostactualAction) {
		   
	logger("The " + method + " path is: " + Path,"debug")
	    
    def headers = [:] 
    headers.put("HOST", "$settings.piIP:$settings.piPort")
    def decoded="$settings.piUser:$settings.piPsswd"
    def encoded = "Basic "+decoded.bytes.encodeBase64()  
    headers.put("Authorization",encoded)
    
    try {    	
        if(setGPIODirection == "OUT") {
        	def setDirection = new physicalgraph.device.HubAction(
            	method: "POST",
            	path: "/GPIO/" + gpioPin  + "/function/OUT",
            	headers: headers)
			logger("POSTing OUT","trace")
        	sendHubCommand(setDirection);
        } else if(setGPIODirection == "IN") {
        	def setDirection = new physicalgraph.device.HubAction(
            	method: "POST",
            	path: "/GPIO/" + gpioPin  + "/function/IN",
            	headers: headers)
				logger("POSTing IN","trace")
        	sendHubCommand(setDirection);
        }
        
        def actualAction = new physicalgraph.device.HubAction(
            method: method,
            path: Path,
            headers: headers)

        sendHubCommand(actualAction)        
    }
    catch (Exception e) {
		logger("Hit Exception $e on $hubAction","warn")
    }
}

/* Helper functions to get the network device ID */
private String NetworkDeviceId(){
    def iphex = convertIPtoHex(settings.piIP).toUpperCase()
    def porthex = convertPortToHex(settings.piPort)
    return "$iphex:$porthex" 
}

private String convertIPtoHex(ipAddress) { 
    String hex = ipAddress.tokenize( '.' ).collect {  String.format( '%02x', it.toInteger() ) }.join()
	logger("IP address entered is $ipAddress and the converted hex code is $hex","debug")
    return hex

}

private String convertPortToHex(port) {
    String hexport = port.toString().format( '%04x', port.toInteger() )
	logger("hexport:$hexport","debug")
    return hexport
}
/**
 *  logger()
 *
 *  Wrapper function for all logging.
 **/
private logger(msg, level = "debug") {

    switch(level) {
        case "error":
            if (state.loggingLevelIDE >= 1) log.error msg
            break

        case "warn":
            if (state.loggingLevelIDE >= 2) log.warn msg
            break

        case "info":
            if (state.loggingLevelIDE >= 3) log.info msg
            break

        case "debug":
            if (state.loggingLevelIDE >= 4) log.debug msg
            break

        case "trace":
            if (state.loggingLevelIDE >= 5) log.trace msg
            break

        default:
            log.debug msg
            break
    }
}
