package com.niharika.auth.entities;

import java.time.Instant;
import java.util.HashSet;
import java.util.UUID;

public class User {
    private UUID id;
    private String email;
    private String name;
    private String password;
    private String image;
    private boolean enable = true;
    private Instant createdAt = Instant.now();
    private Instant updatedAt = Instant.now();
    //private String gender;
    //private Address address;

    private Provider provider = Provider.LOCAL;

    private Set<Role> roles = new HashSet<>();

}
