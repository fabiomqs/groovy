package com.therealdanvega

import com.therealdanvega.domain.User

User user = new User( id: 1L, firstName: "Dexter", lasttName: "Morgan",
        email: "darkpassenger@email.com", dob: new Date())
user.printFullName()
println "_____________________________________________________"
println user

