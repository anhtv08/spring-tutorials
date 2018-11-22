package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    description("""
    should reuturn 404 code as request is not found
""")
    request {

        method("GET")
        url("/hello/abc")
        headers {
            applicationJson()
        }
    }

    response {
        headers {applicationJson()}

        status(404)
    }
}
