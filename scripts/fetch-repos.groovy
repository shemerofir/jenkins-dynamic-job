//This script should be placed in the first active choice.

import groovy.json.JsonSlurper
def get = new URL("https://api.github.com/users/nirgeier/repos").openConnection();
def getRC = get.getResponseCode();

if (getRC.equals(200)) {
    def json = get.inputStream.withCloseable { inStream ->
        new JsonSlurper().parse( inStream as InputStream )
    }

    def item = json;
    def names = [];

    item.each { repo ->
        names.push(repo.name);
    }   
    return names;
}