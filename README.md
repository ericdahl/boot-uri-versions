# boot-uri-versions

Example app meant to illustrate an approach to support multiple versions of a REST endpoint, utilizing aliases.

This app calculates the prime factorization of a number. There are two different incompatible versions of the API:
v1 and v2, described below:

## V1

- `/factors/v1/{n}`
- "currently" aliased to `/factors/stable/{n}`

## V2

- `/factors/v2/{n}`
- "currently" aliased to `/factors/beta/{n}`

## Example

```bash
$ curl http://localhost:8080/factors/v1/2283 ; echo
[3,761]
$ curl http://localhost:8080/factors/stable/2283 ; echo  # alias
[3,761]
$ 
$ 
$ curl http://localhost:8080/factors/v2/2283 ; echo
{"results":[3,761],"stats":{"timeTaken":111}}
$ curl http://localhost:8080/factors/beta/2283 ; echo
{"results":[3,761],"stats":{"timeTaken":111}}
```


This is implemented simply by having a controller for each incompatible version. Each controller has multiple
mappings for the aliases.


