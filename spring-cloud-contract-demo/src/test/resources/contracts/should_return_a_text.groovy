package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    description("""
    first test with cloud contract, should return a hello text
""")
    request {

        method("GET")
        url("/hello")
        headers {
            applicationJson()
        }
    }

    response {
        headers {applicationJson()}
        body("""

{
                "firstName" : "Joey",
                "lastName" : "Trang",
                "age" : 10
}
"""


        )




       

        status(200)
    }
}
