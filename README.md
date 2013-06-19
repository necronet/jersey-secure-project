## Jersey + glassfish + Security


Sample project of hello world with glassfish security file realm.

##How to test

To make it work get the project sources. Make sure that in glassfish you have configured in your file realm the credentials with the **username: user** (yes very creative) in **group: user**

This will map to the xml

	<security-role-mapping>
        <role-name>user</role-name>
        <group-name>user</group-name>
    </security-role-mapping>


##Interesting reading

- [Roles, Principals, and Principal to Role Mapping:](http://docs.oracle.com/cd/E19776-01/820-4496/beacr/index.html) Explaining a bit about principals, roles and mapping between them. No too much but it is a great introduction to it plus it can clear some things out.

- [Simplified Security Role Mapping:](https://blogs.oracle.com/bobby/entry/simplified_security_role_mapping) This is pretty much an old thread but still worth it to read it. I really like this explanation:
 
>Because security role mapping happens at deployment time, the 
>default mapping must be turned on before the application is 
>deployed. To turn on the default mapping, choose Configuration
>Security in the admin console. Click Enabled next to Default 
>Principal to Role Mapping and Save.



- [A simple JAX-RS security context example in GlassFish:](http://www.butonic.de/2010/06/18/a-simple-jax-rs-security-context-example-in-glassfish/) By far this it's the best source of inspiration for this sample project, and nailed it what I was trying t do the only difference is that this project does rely on the **file realm** instead of creating a new one.




