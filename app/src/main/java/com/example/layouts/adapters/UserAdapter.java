package com.example.layouts.adapters;

import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.layouts.R;
import com.example.layouts.models.User;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {

    private static final String TAG = "UserAdapter";

    private List<User> mUsers;
    private Context mContext;

    public UserAdapter(List<User> users, Context context) {
        mUsers = users;
        mContext = context;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item_user_list, parent, false);
        UserHolder userHolder = new UserHolder(view);

        Log.d(TAG, "onCreateViewHolder: called");

        return userHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
        holder.bind(mUsers.get(position));

        Log.d(TAG, "onBindViewHolder: called");
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    class UserHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView mUsername;
        private CircleImageView mUserImage;
        private User mUser;

        public UserHolder(@NonNull View itemView) {
            super(itemView);

            mUsername = itemView.findViewById(R.id.item_user_name);
            mUserImage = itemView.findViewById(R.id.item_user_image);

            itemView.setOnClickListener(this);

        }

        private void bind(User user) {
            mUser = user;
            mUserImage.setImageResource(user.getImageResId());
            mUsername.setText(user.getName());
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(mContext, mUser.getName(), Toast.LENGTH_LONG).show();
        }
    }
}
