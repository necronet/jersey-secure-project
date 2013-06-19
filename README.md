## Jersey + glassfish + Security


Sample project of hello world with glassfish security file realm.

##How to test

To make it work get the project sources. Make sure that in glassfish you have configured in your file realm the credentials with the **username: user** (yes very creative) in **group: user**

This will map to the xml

	<security-role-mapping>
        <role-name>user</role-name>
        <group-name>user</group-name>
    </security-role-mapping>





