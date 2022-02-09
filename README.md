# Configure dynamic jenkins build

## Jenkins Pre-requisites

---

- Plugins to Install:
  - Docker pipeline
    ![](assets/01.png)
  - Active Choices
    ![](assets/02.png)
  - CloudBees Credentials Plugin
    ![](assets/03.png)

- Credentials:
  - dockerHub Account
  - Github Access Token


<br>


## Steps to create a personal access token and add it to jenkins
---
<br>

1. Go to https://github.com/settings/tokens and login with your github account and go to generate token
<br>
<br>

![](assets/04.png)


2. Confirm the access with your password
<br>
<br>

![](assets/05.png)

3. Give it a note and select on repo, to give permission to manage repos through the token, then click on generate token
<br>
<br>

![](assets/06.png)

![](assets/07.png)

4. Copy the token and save it :)
<br>
<br>

![](assets/08.png)


5. In Jenkins, go to Manage Jenkins, and click on the Manage Credentials option
<br>
<br>

![](assets/09.png)

![](assets/10.png)


6. Select Jenkins on Store Scope
<br>
<br>

![](assets/11.png)

7. Select Global credentials and Add Credentials 
<br>
<br>

![](assets/12.png)

8. On Kind select -> Secret Text, Scope -> Global, Secret -> the github token that we created, ID -> any name and click in okay
<br>
<br>

![](assets/13.png)

8. We have added our credential
<br>
<br>

![](assets/14.png)

## Steps

---
1. **Create PIPELINE project**![](assets/20220201_113033_image.png)

1. **Create PIPELINE project**![](assets/20220201_113033_image.png)
2. **Use the provided jenkinsfile as the pipeline script.**

   ![](assets/20220201_113112_image.png)

   - Includes the parameters configurations
   - Also build, tags and push to docker hub the image as REPO-NAME:latest
3. **Run the job and provide the parameters from the jenkins dashboard** (Click on Build with Parameters)![](assets/20220201_113141_image.png)
   - If the first build fail is because of not specifying the parameters, you need to click on "Build with parameters"
---

<br>
<br>
<br>

### Extra: Also the pipeline can be created from the UI

- We Activate project parameters and configure two (Repo and branch) as follows (Grab the scripts for fetching each param):
  - Repo![](assets/20220201_093256_image.png)
  - Branch (Reactive parameter) ![](assets/20220201_093337_image.png)
- Place the portion of the jenkinsfile that you need

<br>

---
## Notes
 Change your dockerHubUser in the Jenkinsfile script in order to work properly
