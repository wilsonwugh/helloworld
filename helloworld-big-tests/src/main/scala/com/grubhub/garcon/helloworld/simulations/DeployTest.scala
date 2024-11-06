package com.grubhub.garcon.helloworld.simulations


import java.util.concurrent.TimeUnit
import com.grubhub.garcon.helloworld.{GetHealthCheckPublic, GetPingPublic, SetupUsers}
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings
import io.gatling.core.Predef._

import scala.concurrent.duration.DurationInt

@SuppressFBWarnings(Array("PREDICTABLE_RANDOM"))
class DeployTest {
  val scn = scenario("Test helloworld example")
    .exitBlockOnFail(
      exec(new SetupUsers().scn)
        .exec(new GetPingPublic().scn)
        .pause(5 seconds)
        .exec(new GetHealthCheckPublic().scn)
    )
}
