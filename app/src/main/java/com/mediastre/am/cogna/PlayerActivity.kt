package com.mediastre.am.cogna

import am.mediastre.mediastreamplatformsdkandroid.MediastreamPlayer
import am.mediastre.mediastreamplatformsdkandroid.MediastreamPlayerConfig
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

class PlayerActivity : AppCompatActivity() {

    private lateinit var container: FrameLayout
    private lateinit var player: MediastreamPlayer
    private lateinit var config: MediastreamPlayerConfig

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.player_activity)
        config = MediastreamPlayerConfig()
        config.id = "6284101f4373640823893cdb"
        config.accountID = "5e6f83ae335cdd1163e16b5b"
        config.type = MediastreamPlayerConfig.VideoTypes.VOD
        config.autoplay = true
        config.appName = "Cogna Mediastream Sample Test"
        container = findViewById(R.id.main_media_frame)
        player = MediastreamPlayer(this, config, container)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        player.releasePlayer()
    }
}