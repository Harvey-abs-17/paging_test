package com.example.paging.model


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

class Image : ArrayList<Image.ImageItem>(){
    @Parcelize
    data class ImageItem(
        @SerializedName("alt_description")
        var altDescription: String?, // a person standing in the desert holding a lantern
        @SerializedName("blur_hash")
        var blurHash: String?, // L24_a@%M4:M{K*of$gaxMKM|o}of
        @SerializedName("color")
        var color: String?, // #262626
        @SerializedName("created_at")
        var createdAt: String?, // 2023-04-28T13:32:49Z
        @SerializedName("description")
        var description: String?, // The remote NEOM desert environment sets the scene for spectacular stargazing, Hisma Desert – NEOM, Saudi Arabia.
        @SerializedName("height")
        var height: Int?, // 3000
        @SerializedName("id")
        var id: String?, // rVC6O_gDE0Q
        @SerializedName("liked_by_user")
        var likedByUser: Boolean?, // false
        @SerializedName("likes")
        var likes: Int?, // 199
        @SerializedName("links")
        var links: Links?,
        @SerializedName("promoted_at")
        var promotedAt: String?, // 2023-05-01T07:22:51Z
        @SerializedName("slug")
        var slug: String?, // rVC6O_gDE0Q
        @SerializedName("sponsorship")
        var sponsorship: Sponsorship?,
        @SerializedName("topic_submissions")
        var topicSubmissions: TopicSubmissions?,
        @SerializedName("updated_at")
        var updatedAt: String?, // 2023-07-19T03:38:23Z
        @SerializedName("urls")
        var urls: Urls?,
        @SerializedName("user")
        var user: User?,
        @SerializedName("width")
        var width: Int? // 4500
    ) : Parcelable {
        @Parcelize
        data class Links(
            @SerializedName("download")
            var download: String?, // https://unsplash.com/photos/rVC6O_gDE0Q/download?ixid=M3w0NzY4Mjl8MXwxfGFsbHwxfHx8fHx8Mnx8MTY4OTc5OTk1OHw
            @SerializedName("download_location")
            var downloadLocation: String?, // https://api.unsplash.com/photos/rVC6O_gDE0Q/download?ixid=M3w0NzY4Mjl8MXwxfGFsbHwxfHx8fHx8Mnx8MTY4OTc5OTk1OHw
            @SerializedName("html")
            var html: String?, // https://unsplash.com/photos/rVC6O_gDE0Q
            @SerializedName("self")
            var self: String? // https://api.unsplash.com/photos/rVC6O_gDE0Q
        ) : Parcelable
    
        @Parcelize
        data class Sponsorship(
            @SerializedName("impression_urls")
            var impressionUrls: List<String?>?,
            @SerializedName("sponsor")
            var sponsor: Sponsor?,
            @SerializedName("tagline")
            var tagline: String?, // Made to Change
            @SerializedName("tagline_url")
            var taglineUrl: String? // https://www.neom.com/en-us?utm_source=unsplash&utm_medium=referral
        ) : Parcelable {
            @Parcelize
            data class Sponsor(
                @SerializedName("accepted_tos")
                var acceptedTos: Boolean?, // true
                @SerializedName("bio")
                var bio: String?, // Located in the northwest of Saudi Arabia, NEOM’s diverse climate offers both sun-soaked beaches and snow-capped mountains. NEOM’s unique location will provide residents with enhanced livability while protecting 95% of the natural landscape.
                @SerializedName("first_name")
                var firstName: String?, // NEOM
                @SerializedName("for_hire")
                var forHire: Boolean?, // false
                @SerializedName("id")
                var id: String?, // mYizSrdJkkU
                @SerializedName("instagram_username")
                var instagramUsername: String?, // discoverneom
                @SerializedName("links")
                var links: Links?,
                @SerializedName("location")
                var location: String?, // NEOM, Saudi Arabia
                @SerializedName("name")
                var name: String?, // NEOM
                @SerializedName("portfolio_url")
                var portfolioUrl: String?, // http://www.neom.com
                @SerializedName("profile_image")
                var profileImage: ProfileImage?,
                @SerializedName("social")
                var social: Social?,
                @SerializedName("total_collections")
                var totalCollections: Int?, // 7
                @SerializedName("total_likes")
                var totalLikes: Int?, // 0
                @SerializedName("total_photos")
                var totalPhotos: Int?, // 202
                @SerializedName("twitter_username")
                var twitterUsername: String?, // neom
                @SerializedName("updated_at")
                var updatedAt: String?, // 2023-07-19T18:45:56Z
                @SerializedName("username")
                var username: String? // neom
            ) : Parcelable {
                @Parcelize
                data class Links(
                    @SerializedName("followers")
                    var followers: String?, // https://api.unsplash.com/users/neom/followers
                    @SerializedName("following")
                    var following: String?, // https://api.unsplash.com/users/neom/following
                    @SerializedName("html")
                    var html: String?, // https://unsplash.com/@neom
                    @SerializedName("likes")
                    var likes: String?, // https://api.unsplash.com/users/neom/likes
                    @SerializedName("photos")
                    var photos: String?, // https://api.unsplash.com/users/neom/photos
                    @SerializedName("portfolio")
                    var portfolio: String?, // https://api.unsplash.com/users/neom/portfolio
                    @SerializedName("self")
                    var self: String? // https://api.unsplash.com/users/neom
                ) : Parcelable
    
                @Parcelize
                data class ProfileImage(
                    @SerializedName("large")
                    var large: String?, // https://images.unsplash.com/profile-1679489218992-ebe823c797dfimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                    @SerializedName("medium")
                    var medium: String?, // https://images.unsplash.com/profile-1679489218992-ebe823c797dfimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                    @SerializedName("small")
                    var small: String? // https://images.unsplash.com/profile-1679489218992-ebe823c797dfimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
                ) : Parcelable
    
                @Parcelize
                data class Social(
                    @SerializedName("instagram_username")
                    var instagramUsername: String?, // discoverneom
                    @SerializedName("portfolio_url")
                    var portfolioUrl: String?, // http://www.neom.com
                    @SerializedName("twitter_username")
                    var twitterUsername: String? // neom
                ) : Parcelable
            }
        }
    
        @Parcelize
        data class TopicSubmissions(
            @SerializedName("fashion-beauty")
            var fashionBeauty: FashionBeauty?,
            @SerializedName("people")
            var people: People?
        ) : Parcelable {
            @Parcelize
            data class FashionBeauty(
                @SerializedName("status")
                var status: String? // unevaluated
            ) : Parcelable
    
            @Parcelize
            data class People(
                @SerializedName("status")
                var status: String? // unevaluated
            ) : Parcelable
        }
    
        @Parcelize
        data class Urls(
            @SerializedName("full")
            var full: String?, // https://images.unsplash.com/photo-1682688759350-050208b1211c?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0NzY4Mjl8MXwxfGFsbHwxfHx8fHx8Mnx8MTY4OTc5OTk1OHw&ixlib=rb-4.0.3&q=85
            @SerializedName("raw")
            var raw: String?, // https://images.unsplash.com/photo-1682688759350-050208b1211c?ixid=M3w0NzY4Mjl8MXwxfGFsbHwxfHx8fHx8Mnx8MTY4OTc5OTk1OHw&ixlib=rb-4.0.3
            @SerializedName("regular")
            var regular: String?, // https://images.unsplash.com/photo-1682688759350-050208b1211c?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0NzY4Mjl8MXwxfGFsbHwxfHx8fHx8Mnx8MTY4OTc5OTk1OHw&ixlib=rb-4.0.3&q=80&w=1080
            @SerializedName("small")
            var small: String?, // https://images.unsplash.com/photo-1682688759350-050208b1211c?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0NzY4Mjl8MXwxfGFsbHwxfHx8fHx8Mnx8MTY4OTc5OTk1OHw&ixlib=rb-4.0.3&q=80&w=400
            @SerializedName("small_s3")
            var smallS3: String?, // https://s3.us-west-2.amazonaws.com/images.unsplash.com/small/photo-1682688759350-050208b1211c
            @SerializedName("thumb")
            var thumb: String? // https://images.unsplash.com/photo-1682688759350-050208b1211c?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0NzY4Mjl8MXwxfGFsbHwxfHx8fHx8Mnx8MTY4OTc5OTk1OHw&ixlib=rb-4.0.3&q=80&w=200
        ) : Parcelable
    
        @Parcelize
        data class User(
            @SerializedName("accepted_tos")
            var acceptedTos: Boolean?, // true
            @SerializedName("bio")
            var bio: String?, // Located in the northwest of Saudi Arabia, NEOM’s diverse climate offers both sun-soaked beaches and snow-capped mountains. NEOM’s unique location will provide residents with enhanced livability while protecting 95% of the natural landscape.
            @SerializedName("first_name")
            var firstName: String?, // NEOM
            @SerializedName("for_hire")
            var forHire: Boolean?, // false
            @SerializedName("id")
            var id: String?, // mYizSrdJkkU
            @SerializedName("instagram_username")
            var instagramUsername: String?, // discoverneom
            @SerializedName("last_name")
            var lastName: String?, // Jadach
            @SerializedName("links")
            var links: Links?,
            @SerializedName("location")
            var location: String?, // NEOM, Saudi Arabia
            @SerializedName("name")
            var name: String?, // NEOM
            @SerializedName("portfolio_url")
            var portfolioUrl: String?, // http://www.neom.com
            @SerializedName("profile_image")
            var profileImage: ProfileImage?,
            @SerializedName("social")
            var social: Social?,
            @SerializedName("total_collections")
            var totalCollections: Int?, // 7
            @SerializedName("total_likes")
            var totalLikes: Int?, // 0
            @SerializedName("total_photos")
            var totalPhotos: Int?, // 202
            @SerializedName("twitter_username")
            var twitterUsername: String?, // neom
            @SerializedName("updated_at")
            var updatedAt: String?, // 2023-07-19T18:45:56Z
            @SerializedName("username")
            var username: String? // neom
        ) : Parcelable {
            @Parcelize
            data class Links(
                @SerializedName("followers")
                var followers: String?, // https://api.unsplash.com/users/neom/followers
                @SerializedName("following")
                var following: String?, // https://api.unsplash.com/users/neom/following
                @SerializedName("html")
                var html: String?, // https://unsplash.com/@neom
                @SerializedName("likes")
                var likes: String?, // https://api.unsplash.com/users/neom/likes
                @SerializedName("photos")
                var photos: String?, // https://api.unsplash.com/users/neom/photos
                @SerializedName("portfolio")
                var portfolio: String?, // https://api.unsplash.com/users/neom/portfolio
                @SerializedName("self")
                var self: String? // https://api.unsplash.com/users/neom
            ) : Parcelable
    
            @Parcelize
            data class ProfileImage(
                @SerializedName("large")
                var large: String?, // https://images.unsplash.com/profile-1679489218992-ebe823c797dfimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128
                @SerializedName("medium")
                var medium: String?, // https://images.unsplash.com/profile-1679489218992-ebe823c797dfimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=64&h=64
                @SerializedName("small")
                var small: String? // https://images.unsplash.com/profile-1679489218992-ebe823c797dfimage?ixlib=rb-4.0.3&crop=faces&fit=crop&w=32&h=32
            ) : Parcelable
    
            @Parcelize
            data class Social(
                @SerializedName("instagram_username")
                var instagramUsername: String?, // discoverneom
                @SerializedName("portfolio_url")
                var portfolioUrl: String?, // http://www.neom.com
                @SerializedName("twitter_username")
                var twitterUsername: String? // neom
            ) : Parcelable
        }
    }
}