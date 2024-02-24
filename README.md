# JavaMiniProject
A repository for the java project
The application is for people to find medical resources in a community and visit doctors based on their convenience. This application consists of 3 types of users: Patient, Doctor and Administrator. The application flow is based on each user type.

Patient:
Once the user successfully logs in as a patient, he is redirected to the Patient Panel/View. The user can select a location and retrieve the hospital and doctor details available at the selected location. 

Doctor:
When the user logs in successfully as a doctor, he is redirected to the Doctor Panel where he has the option to 'Add new Patient', 'Add new Encounter', and 'View Patient Details'. In the 'Add new Patient' screen, the doctor has to enter the patients details like Name, Dob,Contact Number and the PatientId. Then on submitting the form using 'Add New Patient' button, the patient information is successfully added. Next, the doctor has to add the encounter details for the patient by clicking on the 'Add new Encounter' button. Upon adding the encounter details and clicking the 'Add Encounter', the encounter details gets mapped to the respective patient. The next screen that the Doctor Panel has is the 'View Patient Details' screen. In the 'View Patient Details' screen, the doctor can see the patients that are added to the application. He has the option to 'Update' the patients contact number by clicking on the 'Contact No' field , modifying the contact number and then save the changes by clicking the 'Update' button present in the 'Action' column. Teh doctor can view the encounter details of the patient by clicking the  'View Encounter' button that is available in the 'Action' column. The doctor can also delete a patient from the application by clicking on the 'Delete' button present in the 'Action' column.

Administrator:
The user who is logged in successfully into the application as Admin can add new communities by entering the Community in the community text field and clicking the 'Add Community'. The newly added community will be available in the Hospital Community dropdown. The Admin can also add new hospitals for the communities by entering the hospital details like Hospital Name, Hospital Location and Hospital Community and then clicking on the 'Add Hospital' button. Once the hospital is added, it will be available in the table that is present in the screen. 

