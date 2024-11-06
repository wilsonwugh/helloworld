package com.grubhub.garcon.helloworld

import com.grubhub.garcon.roux.bigtests.base.RouxPredef._
import com.grubhub.garcon.roux.bigtests.base._
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder

class SetupUsers {
  val ghHeadersClaim = Claim("gh-headers", "*")
  val brandClaim = Claim("brand", "GRUBHUB")
  val adminClaim = Claim("gh-admin", "helloworld")
  val getClaim = Claim("specregistry.get", "")
  val setClaim = Claim("specregistry.set", "")
  val claims = List(ghHeadersClaim, brandClaim, adminClaim, getClaim, setClaim)
  var scn: ScenarioBuilder = _
  var login = new CreateSessionForTest("GRUBHUB", claims, SimulationBase.rpcUrl, "helloworldadmin@grubhub.com", true, true)

  scn = scenario("Login User")
    .exec(login.httpRequest
      .check(status.is(200))
      .check(jsonPath("$..access_token").exists.saveAs("access_token"))
    )
}
