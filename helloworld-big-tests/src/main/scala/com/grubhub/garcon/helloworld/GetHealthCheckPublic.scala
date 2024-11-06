package com.grubhub.garcon.helloworld

import com.grubhub.garcon.roux.bigtests.base.RouxPredef.http
import com.grubhub.garcon.roux.bigtests.base.SimulationBase
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class GetHealthCheckPublic {
val uri = s"${SimulationBase.baseUrl}/helloworld/healthcheck"

val httpRequest = http("Get healthcheck via public API")
.get(uri)
.header("Authorization", "Bearer ${access_token}")

val scn = scenario("Getting healthcheck from public end-point")
.exec(httpRequest.check(status.is(202)))

}
