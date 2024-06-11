UsMobile_OA
Coding assesment for Us Mobile

API design Explanation:
The API design I used was standard. I used a controller layer and a repository layer. The controller layer is in charge of capturing API requests made to the server and the repository layer is in charge of calling the database and parsing the query results into readable values. Those values are then returned to the controller and then back out as the response. For API testing I used swagger. For the query requests, I used the search indexes from Mongo DB exported to Java.

Add a new User:
<img width="1319" alt="Screen Shot 2024-06-11 at 12 08 06 PM" src="https://github.com/sreeTemporary/UsMobile_OA/assets/172415694/9add66aa-c797-4109-a331-a875e5c6e2b6">
<img width="982" alt="Screen Shot 2024-06-11 at 12 07 08 PM" src="https://github.com/sreeTemporary/UsMobile_OA/assets/172415694/c73a7fb6-b874-40bf-8b66-1373a10fde15">

Update User:
<img width="914" alt="Screen Shot 2024-06-11 at 12 10 18 PM" src="https://github.com/sreeTemporary/UsMobile_OA/assets/172415694/a957251e-2188-4287-a4b7-263f5744fe2e">
<img width="1026" alt="Screen Shot 2024-06-11 at 12 09 53 PM" src="https://github.com/sreeTemporary/UsMobile_OA/assets/172415694/51aa1dbd-8cd8-4934-86f8-9cb77977c0ae">

Get Cycle History:
<img width="915" alt="Screen Shot 2024-06-11 at 12 13 48 PM" src="https://github.com/sreeTemporary/UsMobile_OA/assets/172415694/1e3a83ab-9c20-402c-9f7f-813775f69cfc">

Get daily usage:
<img width="920" alt="Screen Shot 2024-06-11 at 12 15 34 PM" src="https://github.com/sreeTemporary/UsMobile_OA/assets/172415694/96977f05-52fa-4d0f-9ff2-7b51ff691065">


Improvements:
The first improvement I would make is to create DB auditing changes. I would add 4 new fields to each collection, - createdOn, createdBy, updatedOn, updatedBy. These fields would allow other company employees to see the changes made in the collection.
I would also create a lookup table between userId and mdn so that the cycle and daily usage values can be queried against one value instead of two. 
For example:
lookupTable - 
userId  mdn
1        111-000-1111
1        111-222-1111
2        222-000-1111
2        222-333-1111

then the Daily usage and Cycle don't have to use UserId and it can be searched by just mdn,
