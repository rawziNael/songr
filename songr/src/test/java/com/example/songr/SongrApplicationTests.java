package com.example.songr;

import com.example.songr.domain.Album;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("test for constructor")
	public void albumConstructor()
	{
		Album album = new Album ("test1","artist1",5,8.17,"");

		assertEquals("test1",album.getTitle());
		assertEquals("artist1",album.getArtist());
		assertEquals(5,album.getSongCount());
		assertEquals(8.17,album.getLength());
		assertEquals("",album.getImageUrl());
	}



}
