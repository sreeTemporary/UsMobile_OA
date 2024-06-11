[Daily_Usage.json](https://github.com/user-attachments/files/15792688/Daily_Usage.json)# UsMobile_OA
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

Dummy json data:
[Uploading Daily_Us[Cycle.json](https://github.com/user-attachments/files/15792689/Cycle.json)age.json…]()
[Daily_Usage.json](https://github.com/user-attachments/files/15792695/Daily_Usage.json)[
    {
      "mdn": "555-123-0001",
      "userId": “666330503f073de8d8a86d94”,
      "usageDate": "2024-06-01T00:00:00Z",
      "usedInMb": 150
    },
    {
      "mdn": "555-123-0002",
      "userId": "666330503f073de8d8a86d95",
      "usageDate": "2024-06-02T00:00:00Z",
      "usedInMb": 200
    },
    {
      "mdn": "555-123-0003",
      "userId": "666330503f073de8d8a86d96",
      "usageDate": "2024-06-03T00:00:00Z",
      "usedInMb": 180
    },
    {
      "mdn": "555-123-0004",
      "userId":"666330503f073de8d8a86d97",
      "usageDate": "2024-06-04T00:00:00Z",
      "usedInMb": 220
    },
    {
      "mdn": "555-123-0001”,
      "userId": "666330503f073de8d8a86d94”,
      "usageDate": "2024-06-05T00:00:00Z",
      "usedInMb": 190
    },
    {
      "mdn": "555-123-0005”,
      "userId": "666330503f073de8d8a86d95",
      "usageDate": "2024-06-06T00:00:00Z",
      "usedInMb": 210
    },
    {
      "mdn": "555-123-0003”,
      "userId": "666330503f073de8d8a86d96",
      "usageDate": "2024-06-07T00:00:00Z",
      "usedInMb": 240
    },
    {
      "mdn": "555-123-0004”,
      "userId": "666330503f073de8d8a86d97",
      "usageDate": "2024-06-08T00:00:00Z",
      "usedInMb": 230
    },
    {
      "mdn": "555-123-0001”,
      "userId": "666330503f073de8d8a86d94",
      "usageDate": "2024-06-09T00:00:00Z",
      "usedInMb": 260
    },
    {
      "mdn": "555-123-0002,
      "userId": "666330503f073de8d8a86d95",
      "usageDate": "2024-06-10T00:00:00Z",
      "usedInMb": 270
    },
    {
      "mdn": "555-123-0003”,
      "userId”:”666330503f073de8d8a86d96",
      "usageDate": "2024-06-11T00:00:00Z",
      "usedInMb": 250
    },
    {
      "mdn": "555-123-0004”,
      "userId": "666330503f073de8d8a86d97",
      "usageDate": "2024-06-12T00:00:00Z",
      "usedInMb": 280
    },
    {
      "mdn": "555-123-0001”,
      "userId": "666330503f073de8d8a86d94",
      "usageDate": "2024-06-13T00:00:00Z",
      "usedInMb": 290
    },
    {
      "mdn": "555-123-0005”,
      "userId": "666330503f073de8d8a86d95",
      "usageDate": "2024-06-14T00:00:00Z",
      "usedInMb": 300
    },
    {
      "mdn": "555-123-0003”,
      "userId": "666330503f073de8d8a86d96",
      "usageDate": "2024-06-15T00:00:00Z",
      "usedInMb": 310
    },
    {
      "mdn": "555-123-0004”,
      "userId":"666330503f073de8d8a86d97",
      "usageDate": "2024-06-16T00:00:00Z",
      "usedInMb": 320
    },
    {
      "mdn": "555-123-0001”,
      "userId":"666330503f073de8d8a86d94",
      "usageDate": "2024-06-17T00:00:00Z",
      "usedInMb": 330
    },
    {
      "mdn": "555-123-0002”,
      "userId":"666330503f073de8d8a86d95",
      "usageDate": "2024-06-18T00:00:00Z",
      "usedInMb": 340
    },
    {
      "mdn": "555-123-0003”,
      "userId":"666330503f073de8d8a86d96",
      "usageDate": "2024-06-19T00:00:00Z",
      "usedInMb": 350
    },
    {
      "mdn": "555-123-0004”,
      "userId":"666330503f073de8d8a86d97",
      "usageDate": "2024-06-20T00:00:00Z",
      "usedInMb": 360
    }
  ]
  




Improvements:
The first improvement I would make is to create DB auditing changes. I would add 4 new fields to each collection, - createdOn, createdBy, updatedOn, updatedBy. These fields would allow other company employees see the changes that were made in the collection.
