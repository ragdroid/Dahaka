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

    class Builder private constructor() {
        private var imageUrl: String? = null
        private var name: String? = null
        private var weight: Int = 0
        private var height: Int = 0
        private var experience: Int = 0

        fun imageUrl(`val`: String): Builder {
            imageUrl = `val`
            return this
        }

        fun name(`val`: String): Builder {
            name = `val`
            return this
        }

        fun weight(`val`: Int): Builder {
            weight = `val`
            return this
        }

        fun height(`val`: Int): Builder {
            height = `val`
            return this
        }

        fun experience(`val`: Int): Builder {
            experience = `val`
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
