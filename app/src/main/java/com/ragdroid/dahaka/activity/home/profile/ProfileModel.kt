package com.ragdroid.dahaka.activity.home.profile

/**
 * Created by garimajain on 16/08/17.
 */

class ProfileModel private constructor(builder: Builder) {

    var imageUrl: String? = null
    var name: String? = null
    var weight: Int = 0
    var height: Int = 0
    var experience: Int = 0

    init {
        imageUrl = builder.imageUrl
        name = builder.name
        weight = builder.weight
        height = builder.height
        experience = builder.experience
    }

    class Builder constructor() {
        var imageUrl: String? = null
        var name: String? = null
        var weight: Int = 0
        var height: Int = 0
        var experience: Int = 0

        fun imageUrl(value: String): Builder {
            imageUrl = value
            return this
        }

        fun name(value: String): Builder {
            name = value
            return this
        }

        fun weight(value: Int): Builder {
            weight = value
            return this
        }

        fun height(value: Int): Builder {
            height = value
            return this
        }

        fun experience(value: Int): Builder {
            experience = value
            return this
        }

        fun build(): ProfileModel {
            return ProfileModel(this)
        }
    }

    companion object {

        fun newBuilder(): Builder {
            return Builder()
        }
    }
}
