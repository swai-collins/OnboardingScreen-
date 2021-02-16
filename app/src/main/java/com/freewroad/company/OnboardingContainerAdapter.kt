package com.freewroad.company

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OnboardingContainerAdapter(private val OnboardingContainer: List<OnboardingContainer>):
    RecyclerView.Adapter<OnboardingContainerAdapter.OnBoardingContainerViewHolder>(){


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OnBoardingContainerViewHolder {
        return OnBoardingContainerViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.onboarding_container,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OnBoardingContainerViewHolder, position: Int) {
        holder.bind(OnboardingContainer[position])
    }

    override fun getItemCount(): Int {
        return OnboardingContainer.size

    }

    inner class OnBoardingContainerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val onboardingImage = view.findViewById<ImageView>(R.id.onbaordingImage)
        private val textTitle = view.findViewById<TextView>(R.id.textTitle)
        private val textDescription = view.findViewById<TextView>(R.id.textDescription)


        fun bind(onboardingContainer: OnboardingContainer){
            onboardingImage.setImageResource(onboardingContainer.onboardingImage)
            textTitle.text = onboardingContainer.title
            textDescription.text = onboardingContainer.decription
        }
    }
}