# Getting Started

# generate server stubs

go to `~/dev/spg-specs` and run `./gradlew build`, the jar will be in this project. 
copy it to the current project. `cp ~/dev/spg-specs/build/okr/java/server/build/libs/okr-server-1.0.0.jar ~/dev/okr/libs`

# useful curls

```bash
curl -X POST -d '{"id": 1,"description": "win all the okrs","organization_id": 2,"parent_id": 0,"status": "Active","createdBy": 1}' -H "Content-Type: application/json" http://localhost:8080/objective

curl -X GET  http://localhost:8080/objective/1
```

# Data Model

* Objective
  - id
  - description
  - status
  - period_id
  - parent_id
  - organization_id
* Kr
  - id
  - description
  - baseline
  - major_initiative
  - result
  - status
  - objective_id
  - score
* User
  - id
  - first_name
  - last_name
  - email
* Period
  - id
  - description
  

