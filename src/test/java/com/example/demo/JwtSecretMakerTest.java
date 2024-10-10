package com.example.demo;

import java.util.Base64;
import javax.crypto.SecretKey;

import org.junit.jupiter.api.Test;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class JwtSecretMakerTest {

    @Test
    public void generateSecretKey() {
        // Generate secret key using the updated method
        SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS512);
        
        // Encode the key to Base64
        String encodedKey = Base64.getEncoder().encodeToString(key.getEncoded());
        
        // Print the encoded key
        System.out.printf("\nKey = [%s]\n", encodedKey);
    }
}
